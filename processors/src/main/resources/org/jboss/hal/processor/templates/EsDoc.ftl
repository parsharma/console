<#-- @ftlvariable name="types" type="java.util.Collection<org.jboss.hal.processor.EsDocProcessor.Type>" -->
<#list types as type>
class ${type.name} {
    <#if type.constructor??>

    /**
    * ${type.constructor.comment}
     */
    constructor(${type.constructor.parameters}) {}
    </#if>
    <#list type.properties as property>

    /**
     * ${property.comment}
     */
    <#if property.static>static </#if><#if property.getter>get <#elseif property.setter>set </#if>${property.name}(<#if property.setter>value</#if>) {}
    </#list>
    <#list type.methods as method>

    /**
     * ${method.comment}
     */
    <#if method.static>static </#if>${method.name}(${method.parameters}) {}
    </#list>
}

</#list>
