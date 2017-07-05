/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.client.configuration.subsystem.elytron;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import org.jboss.hal.core.CrudOperations;
import org.jboss.hal.core.finder.Finder;
import org.jboss.hal.core.finder.FinderPath;
import org.jboss.hal.core.finder.FinderPathFactory;
import org.jboss.hal.core.mbui.MbuiPresenter;
import org.jboss.hal.core.mbui.MbuiView;
import org.jboss.hal.core.mvp.SupportsExpertMode;
import org.jboss.hal.dmr.ModelNode;
import org.jboss.hal.dmr.ResourceAddress;
import org.jboss.hal.meta.StatementContext;
import org.jboss.hal.meta.token.NameTokens;
import org.jboss.hal.resources.Ids;
import org.jboss.hal.resources.Resources;
import org.jboss.hal.spi.Requires;

import static org.jboss.hal.client.configuration.subsystem.elytron.AddressTemplates.ELYTRON_SUBSYSTEM_ADDRESS;
import static org.jboss.hal.client.configuration.subsystem.elytron.AddressTemplates.ELYTRON_SUBSYSTEM_TEMPLATE;
import static org.jboss.hal.dmr.ModelDescriptionConstants.ELYTRON;


/**
 * @author Claudio Miranda
 */
public class ElytronSubsystemPresenter
        extends MbuiPresenter<ElytronSubsystemPresenter.MyView, ElytronSubsystemPresenter.MyProxy>
        implements SupportsExpertMode {

    // @formatter:off
    @ProxyCodeSplit
    @NameToken(NameTokens.ELYTRON)
    @Requires(value = ELYTRON_SUBSYSTEM_ADDRESS, recursive = false)
    public interface MyProxy extends ProxyPlace<ElytronSubsystemPresenter> {}

    public interface MyView extends MbuiView<ElytronSubsystemPresenter> {
        void update(ModelNode payload);
    }
    // @formatter:on

    private final CrudOperations crud;
    private final FinderPathFactory finderPathFactory;
    private final StatementContext statementContext;
    private final Resources resources;

    @Inject
    public ElytronSubsystemPresenter(final EventBus eventBus,
            final ElytronSubsystemPresenter.MyView view,
            final ElytronSubsystemPresenter.MyProxy proxy,
            final Finder finder,
            final CrudOperations crud,
            final FinderPathFactory finderPathFactory,
            final StatementContext statementContext,
            final Resources resources) {
        super(eventBus, view, proxy, finder);
        this.crud = crud;
        this.finderPathFactory = finderPathFactory;
        this.statementContext = statementContext;
        this.resources = resources;
    }

    @Override
    protected void onBind() {
        super.onBind();
        getView().setPresenter(this);
    }

    @Override
    public ResourceAddress resourceAddress() {
        return ELYTRON_SUBSYSTEM_TEMPLATE.resolve(statementContext);
    }

    @Override
    public FinderPath finderPath() {
        return finderPathFactory.subsystemPath(ELYTRON)
                .append(Ids.ELYTRON, Ids.ELYTRON,
                        resources.constants().settings(), resources.constants().globalSettings());
    }

    @Override
    protected void reload() {
        crud.read(ELYTRON_SUBSYSTEM_TEMPLATE, result -> getView().update(result));
    }
}
