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
package org.jboss.hal.dmr;

/**
 * String constants frequently used in model descriptions and DMR operations.
 *
 * @author Brian Stansberry
 * @author Harald Pehl
 */
@SuppressWarnings({"DuplicateStringLiteralInspection", "SpellCheckingInspection"})
public interface ModelDescriptionConstants {

    // KEEP THESE IN ALPHABETICAL ORDER!
    String ACCEPTOR = "acceptor";
    String ACCESS = "access";
    String ACCESS_CONSTRAINTS = "access-constraints";
    String ACCESS_CONTROL = "access-control";
    String ACCESS_LOG = "access-log";
    String ACCESS_MECHANISM = "access-mechanism";
    String ACCESS_TYPE = "access-type";
    String ACL_MODULE = "acl-module";
    String ACTION = "actions";
    String ACTIONS = "actions";
    String ACTIVE = "active";
    String ACTIVE_COUNT = "active-count";
    String ACTIVE_OPERATION = "active-operation";
    String ACTIVE_SESSIONS = "active-sessions";
    String ADD = "add";
    String ADD_CONTENT = "add-content";
    String ADD_PREFIX_ROLE_MAPPER = "add-prefix-role-mapper";
    String ADD_SUFFIX_ROLE_MAPPER = "add-suffix-role-mapper";
    String ADDRESS = "address";
    String ADDRESS_SETTING = "address-setting";
    String ADMIN_OBJECTS = "admin-objects";
    String ADMIN_ONLY = "admin-only";
    String AGEOUT_HISTORY_OPERATION = "ageout-history";
    String AGGREGATE_HTTP_SERVER_MECHANISM_FACTORY = "aggregate-http-server-mechanism-factory";
    String AGGREGATE_PRINCIPAL_DECODER = "aggregate-principal-decoder";
    String AGGREGATE_PRINCIPAL_TRANSFORMER = "aggregate-principal-transformer";
    String AGGREGATE_PROVIDERS = "aggregate-providers";
    String AGGREGATE_REALM = "aggregate-realm";
    String AGGREGATE_ROLE_MAPPER = "aggregate-role-mapper";
    String AGGREGATE_SASL_SERVER_FACTORY = "aggregate-sasl-server-factory";
    String AGGREGATE_SECURITY_EVENT_LISTENER = "aggregate-security-event-listener";
    String AJP_LISTENER = "ajp-listener";
    String ALGORITHM = "algorithm";
    String ALIAS = "alias";
    String ALLOW_BLANK_PASSWORD = "allow-blank-password";
    String ALLOW_RESOURCE_SERVICE_RESTART = "allow-resource-service-restart";
    String ALLOWED = "allowed";
    String ALLOWED_ORIGINS = "allowed-origins";
    String ALTERNATIVES = "alternatives";
    String ANY = "any";
    String APPLICATION_SECURITY_DOMAIN = "application-security-domain";
    String APPLIED_AT = "applied-at";
    String ARCHIVE = "archive";
    String ASYNC_HANDLER = "async-handler";
    String ASYNC_OPERATIONS = "async-operations";
    String ATTRIBUTE_GROUP = "attribute-group";
    String ATTRIBUTE_MAPPING = "attribute-mapping";
    String ATTRIBUTES = "attributes";
    String ATTRIBUTES_ONLY = "attributes-only";
    String AUTHENTICATION_CONFIGURATION = "authentication-configuration";
    String AUTHENTICATION_CONTEXT = "authentication-context";
    String AUTHOR = "author";
    String AUTHORIZATION = "authorization";
    String AUTO_START = "auto-start";
    String AVERAGE_COMMIT_TIME = "average-commit-time";
    String AVERAGE_PROCESSING_TIME = "average-processing-time";
    String BACKGROUND_VALIDATION = "background-validation";
    String BACKUP = "backup";
    String BACKUPS = "backups";
    String BALANCER = "balancer";
    String BASE_ROLE = "base-role";
    String BATCH_JBERET = "batch-jberet";
    String BATCH_SIZE = "batch-size";
    String BATCH_STATUS = "batch-status";
    String BEAN_VALIDATION = "bean-validation";
    String BEHIND = "behind";
    String BINARY = "binary";
    String BINARY_JDBC = "binary-jdbc";
    String BLOCKING = "blocking";
    String BOOT_CLASS_PATH = "boot-class-path";
    String BOOT_CLASS_PATH_SUPPORTED = "boot-class-path-supported";
    String BOOT_TIME = "boot-time";
    String BOUND_ADDRESS = "bound-address";
    String BOUND_PORT = "bound-port";
    String BRIDGE = "bridge";
    String BROADCAST_GROUP = "broadcast-group";
    String BROWSE_CONTENT = "browse-content";
    String BUFFER_CACHE = "buffer-cache";
    String BUFFER_POOL = "buffer-pool";
    String BUNDLED = "bundled";
    String BYTE_BUFFER_POOL = "byte-buffer-pool";
    String BYTES = "bytes";
    String CACHE_CONTAINER = "cache-container";
    String CACHE_SIZE = "cache-size";
    String CACHE_TYPE = "cache-type";
    String CACHING_REALM = "caching-realm";
    String CALLER_THREAD = "caller-thread";
    String CANCEL_OPERATION = "cancel";
    String CANCEL_NON_PROGRESSING_OPERATION = "cancel-non-progressing-operation";
    String CANCELLED = "cancelled";
    String CAPABILITY_REFERENCE = "capability-reference";
    String CHAINED_PRINCIPAL_TRANSFORMER = "chained-principal-transformer";
    String CHANGE_MESSAGE_PRIORITY = "change-message-priority";
    String CHANGE_MESSAGES_PRIORITY = "change-messages-priority";
    String CHANNEL = "channel";
    String CHILD_TYPE = "child-type";
    String CHILDREN = "children";
    String CLASS = "class";
    String CLASS_NAME = "class-name";
    String CLASS_PATH = "class-path";
    String CLEAR_TEXT = "clear-text";
    String CLIENT_CONFIG = "client-config";
    String CLIENT_MAPPINGS = "client-mappings";
    String CLIENT_SSL_CONTEXT = "client-ssl-context";
    String CLONE = "clone";
    String CLUSTER_CONNECTION = "cluster-connection";
    String COMBINED_DESCRIPTIONS = "combined-descriptions";
    String COMPLETED_TASK_COUNT = "completed-task-count";
    String COMPONENT = "component";
    String COMPONENT_CLASS_NAME = "component-class-name";
    String COMPOSITE = "composite";
    String CONCATENATING_PRINCIPAL_DECODER = "concatenating-principal-decoder";
    String CONFIG_PROPERTIES = "config-properties";
    String CONFIGURABLE_HTTP_SERVER_MECHANISM_FACTORY = "configurable-http-server-mechanism-factory";
    String CONFIGURABLE_SASL_SERVER_FACTORY = "configurable-sasl-server-factory";
    String CONFIGURATION = "configuration";
    String CONNECTED = "connected";
    String CONNECTION_COUNT = "connection-count";
    String CONNECTION_LIMIT_HIGH_WATER_MARK = "connection-limit-high-water-mark";
    String CONNECTION_LIMIT_LOW_WATER_MARK = "connection-limit-low-water-mark";
    String CONNECTION_DEFINITIONS = "connection-definitions";
    String CONNECTION_FACTORY = "connection-factory";
    String CONNECTION_URL = "connection-url";
    String CONNECTOR = "connector";
    String CONNECTOR_NAME = "connector-name";
    String CONNECTOR_SERVICE = "connector-service";
    String CONNECTORS = "connectors";
    String CONSOLE_HANDLER = "console-handler";
    String CONSTANT_PERMISSION_MAPPER = "constant-permission-mapper";
    String CONSTANT_PRINCIPAL_DECODER = "constant-principal-decoder";
    String CONSTANT_PRINCIPAL_TRANSFORMER = "constant-principal-transformer";
    String CONSTANT_REALM_MAPPER = "constant-realm-mapper";
    String CONSTANT_ROLE_MAPPER = "constant-role-mapper";
    String CONSUMES = "consumes";
    String CONSUMER_COUNT = "consumer-count";
    String CONTENT = "content";
    String CONTEXT = "context";
    String CONTEXT_ROOT = "context-root";
    String CONTEXT_SERVICE = "context-service";
    String CORE_POOL_SIZE = "core-pool-size";
    String CORE_SERVICE = "core-service";
    String CORE_SERVICE_PATCHING = "core-service-patching";
    String COUNT_MESSAGES = "count-messages";
    String CRAWLER_SESSION_MANAGEMENT = "crawler-session-management";
    String CREATE = "create";
    String CREATE_TIME = "create-time";
    String CREDENTIAL_REFERENCE = "credential-reference";
    String CREDENTIAL_STORE = "credential-store";
    String CURRENT_THREAD_COUNT = "current-thread-count";
    String CUSTOM = "custom";
    String CUSTOM_CREDENTIAL_SECURITY_FACTORY = "custom-credential-security-factory";
    String CUSTOM_FORMATTER = "custom-formatter";
    String CUSTOM_HANDLER = "custom-handler";
    String CUSTOM_MODIFIABLE_REALM = "custom-modifiable-realm";
    String CUSTOM_PERMISSION_MAPPER = "custom-permission-mapper";
    String CUSTOM_POLICY = "custom-policy";
    String CUSTOM_PRINCIPAL_DECODER = "custom-principal-decoder";
    String CUSTOM_PRINCIPAL_TRANSFORMER = "custom-principal-transformer";
    String CUSTOM_REALM = "custom-realm";
    String CUSTOM_REALM_MAPPER = "custom-realm-mapper";
    String CUSTOM_ROLE_DECODER = "custom-role-decoder";
    String CUSTOM_ROLE_MAPPER = "custom-role-mapper";
    String DATA_COLUMN = "data-column";
    String DATA_SOURCE = "data-source";
    String DATASOURCES = "datasources";
    String DATASOURCE_CLASS = "datasource-class";
    String DEAD_LETTER_ADDRESS = "dead-letter-address";
    String DEFAULT = "default";
    String DEFAULT_BINDINGS = "default-bindings";
    String DEFAULT_CACHE = "default-cache";
    String DEFAULT_HOST = "default-host";
    String DEFAULT_INTERFACE = "default-interface";
    String DEFAULT_JOB_REPOSITORY = "default-job-repository";
    String DEFAULT_REALM = "default-realm";
    String DEFAULT_SECURITY_DOMAIN = "default-security-domain";
    String DEFAULT_SFSB_CACHE = "default-sfsb-cache";
    String DEFAULT_SFSB_PASSIVATION_DISABLED_CACHE = "default-sfsb-passivation-disabled-cache";
    String DEFAULT_SLSB_INSTANCE_POOL = "default-slsb-instance-pool";
    String DEFAULT_THREAD_POOL = "default-thread-pool";
    String DEFAULT_WEB_MODULE = "default-web-module";
    String DELIVERING_COUNT = "delivering-count";
    String DELIVERY_ACTIVE = "delivery-active";
    String DEPENDENT_ADDRESS = "dependent-address";
    String DEPLOY = "deploy";
    String DEPLOYMENT = "deployment";
    String DEPLOYMENT_NAME = "deployment-name";
    String DEPLOYMENT_PERMISSIONS = "deployment-permissions";
    String DEPLOYMENT_SCANNER = "deployment-scanner";
    String DEPRECATED = "deprecated";
    String DESCRIPTION = "description";
    String DESTINATION_ADDRESS = "destination-address";
    String DESTINATION_PORT = "destination-port";
    String DIR_CONTEXT = "dir-context";
    String DIRECT_VERIFICATION = "direct-verification";
    String DISABLED = "disabled";
    String DISABLED_TIME = "disabled-time";
    String DISCONNECTED = "disconnected";
    String DISCOVERY_GROUP = "discovery-group";
    String DISTINGUISHED_NAME = "distinguished-name";
    String DIVERT = "divert";
    String DOMAIN_UUID = "domain-uuid";
    String DOMAIN_ROLLOUT = "domain-rollout";
    String DRIVER_CLASS = "driver-class";
    String DRIVER_CLASS_NAME = "driver-class-name";
    String DRIVER_DATASOURCE_CLASS_NAME = "driver-datasource-class-name";
    String DRIVER_MAJOR_VERSION = "driver-major-version";
    String DRIVER_MINOR_VERSION = "driver-minor-version";
    String DRIVER_MODULE_NAME = "driver-module-name";
    String DRIVER_NAME = "driver-name";
    String DRIVER_VERSION = "driver-version";
    String DROP_ALL_SUBSCRIPTIONS = "drop-all-subscriptions";
    String DRIVER_XA_DATASOURCE_CLASS_NAME = "driver-xa-datasource-class-name";
    String DURABLE = "durable";
    String DURABLE_MESSAGE_COUNT = "durable-message-count";
    String DURABLE_SUBSCRIPTION_COUNT = "durable-subscription-count";
    String EE = "ee";
    String EJB3 = "ejb3";
    String ELYTRON = "elytron";
    String ELYTRON_ENABLED = "elytron-enabled";
    String EMPTY = "empty";
    String ENABLED = "enabled";
    String ENABLED_TIME = "enabled-time";
    String END_TIME = "end-time";
    String ENDPOINT = "endpoint";
    String ENDPOINT_CONFIG = "endpoint-config";
    String ENTRIES = "entries";
    String ERROR_COUNT = "error-count";
    String EVENTS = "events";
    String EXCEPTION_SORTER_CLASS_NAME = "exception-sorter-class-name";
    String EXCEPTIONS = "exceptions";
    String EXCLUDE = "exclude";
    String EXCLUSIVE_RUNNING_TIME = "exclusive-running-time";
    String EXECUTE = "execute";
    String EXECUTION = "execution";
    String EXECUTION_STATUS = "execution-status";
    String EXECUTION_TIME = "execution-time";
    String EXIT_STATUS = "exit-status";
    String EXPIRATION = "expiration";
    String EXPIRE_MESSAGE = "expire-message";
    String EXPIRE_MESSAGES = "expire-messages";
    String EXPIRED_SESSIONS = "expired-sessions";
    String EXPIRY_ADDRESS = "expiry-address";
    String EXPLODE = "explode";
    String EXPLODED = "exploded";
    String EXPRESSION = "expression";
    String EXPRESSIONS_ALLOWED = "expressions-allowed";
    String EXTENSION_POINT = "extension-point";
    String FAILED = "failed";
    String FAILED_OPERATION = "failed-operation";
    String FAILED_SERVICES = "failed-services";
    String FAILURE_DESCRIPTION = "failure-description";
    String FAULT_COUNT = "fault-count";
    String FETCH_SIZE = "fetch-size";
    String FILE = "file";
    String FILE_AUDIT_LOG = "file-audit-log";
    String FILE_HANDLER = "file-handler";
    String FILESYSTEM_REALM = "filesystem-realm";
    String FILTER = "filter";
    String FILTER_REF = "filter-ref";
    String FILTERING_KEY_STORE = "filtering-key-store";
    String FILTERS = "filters";
    String FIND_NON_PROGRESSING_OPERATION = "find-non-progressing-operation";
    String FIXED_PORT = "fixed-port";
    String FLUSH_ALL_CONNECTION_IN_POOL = "flush-all-connection-in-pool";
    String FLUSH_GRACEFULLY_CONNECTION_IN_POOL = "flush-gracefully-connection-in-pool";
    String FLUSH_IDLE_CONNECTION_IN_POOL = "flush-idle-connection-in-pool";
    String FLUSH_INVALID_CONNECTION_IN_POOL = "flush-invalid-connection-in-pool";
    String FORK = "fork";
    String FORMATTER = "formatter";
    String FROM = "from";
    String FULL_REPLACE_DEPLOYMENT = "full-replace-deployment";
    String GENERATE_KEY_PAIR = "generate-key-pair";
    String GLOBAL_MODULES = "global-modules";
    String GROUP = "group";
    String GROUPS_ATTRIBUTE = "groups-attribute";
    String GROUPING_HANDLER = "grouping-handler";
    String HA_POLICY = "ha-policy";
    // HAL_* attributes are used internally only!
    String HAL_INDEX = "hal-index";
    String HAL_LABEL = "hal-label";
    String HAL_LENGTH = "hal-length";
    String HAL_RECURSIVE = "hal-recursive";
    String HANDLER = "handler";
    String HANDLERS = "handlers";
    String HASH = "hash";
    String HEADER_NAME = "header-name";
    String HIBERNATE_PERSISTENCE_UNIT = "hibernate-persistence-unit";
    String HOMEPAGE = "homepage";
    String HOST = "host";
    String HOST_CONNECTION = "host-connection";
    String HOST_SCOPED_ROLE = "host-scoped-role";
    String HOST_STATE = "host-state";
    String HOSTS = "hosts";
    String HTTP = "http";
    String HTTP_ACCEPTOR = "http-acceptor";
    String HTTP_AUTHENTICATION_FACTORY = "http-authentication-factory";
    String HTTP_CONNECTOR = "http-connector";
    String HTTP_INTERFACE = "http-interface";
    String HTTP_INVOKER = "http-invoker";
    String HTTP_LISTENER = "http-listener";
    String HTTP_UPGRADE = "http-upgrade";
    String HTTPS = "https";
    String HTTPS_LISTENER = "https-listener";
    String ID_COLUMN = "id-column";
    String IDENTITY_REALM = "identity-realm";
    String IDENTITY_MAPPING = "identity-mapping";
    String IIOP_OPENJDK = "iiop-openjdk";
    String IMAP = "imap";
    String IMPORT_CERTIFICATE_OPERATION = "import-certificate";
    String IN_VM_ACCEPTOR = "in-vm-acceptor";
    String IN_VM_CONNECTOR = "in-vm-connector";
    String INCLUDE = "include";
    String INCLUDE_ALIASES = "include-aliases";
    String INCLUDE_ALL = "include-all";
    String INCLUDE_DEFAULTS = "include-defaults";
    String INCLUDE_RUNTIME = "include-runtime";
    String INCLUDE_SINGLETONS = "include-singletons";
    String INCLUDES = "includes";
    String INDEX = "index";
    String INET_ADDRESS = "inet-address";
    String INFINISPAN = "infinispan";
    String INPUT_ARGUMENTS = "input-arguments";
    String INPUT_STREAM_INDEX = "input-stream-index";
    String INSTANCE_COUNT = "instance-count";
    String INSTANCE_ID = "instance-id";
    String INTERFACE = "interface";
    String INTERNAL = "internal";
    String INVALIDATE_SESSION_OPERATION = "invalidate-session";
    String INVOCATIONS = "invocations";
    String IO = "io";
    String IO_THREAD_COUNT = "io-thread-count";
    String IO_THREADS = "io-threads";
    String JACC_POLICY = "jacc-policy";
    String JAVA_METHOD = "java-method";
    String JAX_RS = "jaxrs";
    String JCA = "jca";
    String JDR = "jdr";
    String JDBC = "jdbc";
    String JDBC_DRIVER = "jdbc-driver";
    String JDBC_REALM = "jdbc-realm";
    String JGROUPS = "jgroups";
    String JMS_BRIDGE = "jms-bridge";
    String JMS_DELIVERY_MODE = "JMSDeliveryMode";
    String JMS_EXPIRATION = "JMSExpiration";
    String JMS_MESSAGE_ID = "JMSMessageID";
    String JMS_PRIORITY = "JMSPriority";
    String JMS_TIMESTAMP = "JMSTimestamp";
    String JMS_QUEUE = "jms-queue";
    String JMS_TOPIC = "jms-topic";
    String JMX = "jmx";
    String JNDI_NAME = "jndi-name";
    String JOB = "job";
    String JOB_XML_NAME = "job-xml-name";
    String JOB_XML_NAMES = "job-xml-names";
    String JPA = "jpa";
    String JSF = "jsf";
    String JSON = "json";
    String JSP = "jsp";
    String JSR77 = "jsr77";
    String JVM = "jvm";
    String KERBEROS_SECURITY_FACTORY = "kerberos-security-factory";
    String KEY_ALIAS = "key-alias";
    String KEY_MANAGER = "key-manager";
    String KEY_OVERRIDES = "key-overrides";
    String KEY_STORE = "key-store";
    String KEY_STORE_REALM = "key-store-realm";
    String KILL = "kill";
    String LARGEST_THREAD_COUNT = "largest-thread-count";
    String LAST_CONNECTED = "last-connected";
    String LAST_UPDATED_TIME = "last-updated-time";
    String LAUNCH_TYPE = "launch-type";
    String LDAP_KEY_STORE = "ldap-key-store";
    String LDAP_REALM = "ldap-realm";
    String LEVEL = "level";
    String LIBRARY_PATH = "library-path";
    String LICENSE = "license";
    String LINK = "link";
    String LINES = "lines";
    String LIST_ADD_OPERATION = "list-add";
    String LIST_CHANGES_OPERATION = "list-changes";
    String LIST_MESSAGES = "list-messages";
    String LIST_REMOVE_OPERATION = "list-remove";
    String LISTENER = "listener";
    String LIVE_ONLY = "live-only";
    String LOCAL_DESTINATION_OUTBOUND_SOCKET_BINDING = "local-destination-outbound-socket-binding";
    String LOCATION = "location";
    String LOCKING = "locking";
    String LOGGER = "logger";
    String LOGGING = "logging";
    String LOGGING_PROFILE = "logging-profile";
    String LOGICAL_PERMISSION_MAPPER = "logical-permission-mapper";
    String LOGICAL_ROLE_MAPPER = "logical-role-mapper";
    String LOGIN_MODULE = "login-module";
    String MAIL = "mail";
    String MAIL_SESSION = "mail-session";
    String MANAGED = "managed";
    String MANAGED_EXECUTOR_SERVICE = "managed-executor-service";
    String MANAGED_SCHEDULED_EXECUTOR_SERVICE = "managed-scheduled-executor-service";
    String MANAGED_THREAD_FACTORY = "managed-thread-factory";
    String MANAGEMENT = "management";
    String MANAGEMENT_ADDRESS = "management-address";
    String MANAGEMENT_HTTP = "management-http";
    String MANAGEMENT_HTTPS = "management-https";
    String MANAGEMENT_INTERFACE = "management-interface";
    String MANAGEMENT_MAJOR_VERSION = "management-major-version";
    String MANAGEMENT_MICRO_VERSION = "management-micro-version";
    String MANAGEMENT_MINOR_VERSION = "management-minor-version";
    String MANAGEMENT_NOTIFICATION_ADDRESS = "management-notification-address";
    String MANAGEMENT_SPEC_VERSION = "management-spec-version";
    String MANAGEMENT_VERSION = "management-version";
    String MAPPED_REGEX_REALM_MAPPER = "mapped-regex-realm-mapper";
    String MAPPING_MODULE = "mapping-module";
    String MASTER = "master";
    String MATCH_ALL = "match-all";
    String MAX = "max";
    String MAX_ACTIVE_SESSIONS = "max-active-sessions";
    String MAX_PROCESSING_TIME = "max-processing-time";
    String MAX_POOL_SIZE = "max-pool-size";
    String MAX_THREADS = "max-threads";
    String MAXIMUM_PERMISSIONS = "maximum-permissions";
    String MECHANISM_CONFIGURATIONS = "mechanism-configurations";
    String MECHANISM_NAME = "mechanism-name";
    String MECHANISM_PROVIDER_FILTERING_SASL_SERVER_FACTORY = "mechanism-provider-filtering-sasl-server-factory";
    String MECHANISM_REALM_CONFIGURATIONS = "mechanism-realm-configurations";
    String MEMORY = "memory";
    String MESSAGE_COUNT = "message-count";
    String MESSAGE_ID = "message-id";
    String MESSAGES_ADDED = "messages-added";
    String MESSAGING_ACTIVEMQ = "messaging-activemq";
    String METRIC = "metric";
    String MIME_MAPPING = "mime-mapping";
    String MIN = "min";
    String MIN_POOL_SIZE = "min-pool-size";
    String MIN_PROCESSING_TIME = "min-processing-time";
    String MINIMUM_PERMISSIONS = "minimum-permissions";
    String MISSING_TRANSITIVE_DEPENDENCY_PROBLEMS = "missing-transitive-dependency-problems";
    String MIXED_JDBC = "mixed-jdbc";
    String MODCLUSTER = "modcluster";
    String MODE = "mode";
    String MODEL_DESCRIPTION = "model-description";
    String MODULE = "module";
    String MOVE_MESSAGE = "move-message";
    String MOVE_MESSAGES = "move-messages";
    String MULTICAST_ADDRESS = "multicast-address";
    String MULTICAST_PORT = "multicast-port";
    String NAME = "name";
    String NAMESPACES = "namespaces";
    String NAMING = "naming";
    String NATIVE_INTERFACE = "native-interface";
    String NEW_IDENTITY_ATTRIBUTES = "new-identity-attributes";
    String NEW_ITEM_ATTRIBUTES = "new-item-attributes";
    String NEW_ITEM_PATH = "new-item-path";
    String NEW_ITEM_RDN = "new-item-rdn";
    String NEW_ITEM_TEMPLATE = "new-item-template";
    String NEW_PRIORITY = "new-priority";
    String NEXT_TIMEOUT = "next-timeout";
    String NILLABLE = "nillable";
    String NO_TX_SEPARATE_POOL = "no-tx-separate-pool";
    String NODE = "node";
    String NON_DURABLE_MESSAGE_COUNT = "non-durable-message-count";
    String NON_DURABLE_SUBSCRIPTION_COUNT = "non-durable-subscription-count";
    String NONE = "none";
    String NOT = "not";
    String NUMBER_OF_ABORTED_TRANSACTIONS = "number-of-aborted-transactions";
    String NUMBER_OF_APPLICATION_ROLLBACKS = "number-of-application-rollbacks";
    String NUMBER_OF_COMMITTED_TRANSACTIONS = "number-of-committed-transactions";
    String NUMBER_OF_HEURISTICS_TRANSACTIONS = "number-of-heuristics";
    String NUMBER_OF_INFLIGHT_TRANSACTIONS = "number-of-inflight-transactions";
    String NUMBER_OF_NESTED_TRANSACTIONS = "number-of-nested-transactions";
    String NUMBER_OF_RESOURCE_ROLLBACKS = "number-of-resource-rollbacks";
    String NUMBER_OF_SYSTEM_ROLLBACKS = "number-of-system-rollbacks";
    String NUMBER_OF_TIMEDOUT_TRANSACTIONS = "number-of-timed-out-transactions";
    String NUMBER_OF_TRANSACTIONS = "number-of-transactions";
    String OBJECT = "object";
    String OFF_HEAP = "off-heap";
    String OOB = "oob";
    String OP = "operation";
    String OPERATION = "operation";
    String OPERATION_DATE = "operation-date";
    String OPERATION_HEADERS = "operation-headers";
    String OPERATIONS = "operations";
    String OUTBOUND_SOCKET_BINDING_REF = "outbound-socket-binding-ref";
    String OUTCOME = "outcome";
    String OTHER_QUEUE_NAME = "other-queue-name";
    String OTP_CREDENTIAL_MAPPER = "otp-credential-mapper";
    String OVERRIDE = "override";
    String OVERRIDE_ALL = "override-all";
    String OVERRIDE_MODULE = "override-modules";
    String PARTICIPANTS = "partitcipants";
    String PARTITION_HANDLING = "partition-handling";
    String PASSIVATED_COUNT = "passivated-count";
    String PASSIVATION_STORE = "passivation-store";
    String PASSWORD = "password";
    String PATH = "path";
    String PATHS = "paths";
    String PATCH = "patch";
    String PATCH_ID = "patch-id";
    String PATCHING = "patching";
    String PATTERN = "pattern";
    String PATTERN_FILTER = "pattern-filter";
    String PATTERN_FORMATTER = "pattern-formatter";
    String PAUSE = "pause";
    String PAUSED = "paused";
    String PERIODIC_ROTATING_FILE_AUDIT_LOG = "periodic-rotating-file-audit-log";
    String PERIODIC_ROTATING_FILE_HANDLER = "periodic-rotating-file-handler";
    String PERIODIC_SIZE_ROTATING_FILE_HANDLER = "periodic-size-rotating-file-handler";
    String PERMISSION_MAPPINGS = "permission-mappings";
    String PERMISSIONS = "permissions";
    String PERSISTENCE = "persistence";
    String PERSISTENT_SESSIONS = "persistent-sessions";
    String POJO = "pojo";
    String POLICY = "policy";
    String POLICY_MODULE = "policy-module";
    String POOL_CURRENT_SIZE = "pool-current-size";
    String POOL_MAX_SIZE = "pool-max-size";
    String POOL_NAME = "pool-name";
    String POOLED_CONNECTION_FACTORY = "pooled-connection-factory";
    String POP3 = "pop3";
    String PORT = "port";
    String PORT_OFFSET = "port-offset";
    String POSSIBLE_CAUSES = "possible-causes";
    String POST_HANDLER_CHAIN = "post-handler-chain";
    String PRE_HANDLER_CHAIN = "pre-handler-chain";
    String PREDEFINED_FILTER = "predefined-filter";
    String PREFIX = "prefix";
    String PRESERVE = "preserve";
    String PRINCIPALS = "principals";
    String PRINCIPAL_QUERY = "principal-query";
    String PRIORITY = "priority";
    String PROBE_OPERATION = "probe";
    String PROCESSING_TIME = "processing-time";
    String PROCESS_ID_SOCKET_BINDING = "process-id-socket-binding";
    String PROCESS_ID_SOCKET_MAX_PORTS = "process-id-socket-max-ports";
    String PROCESS_ID_UUID = "process-id-uuid";
    String PROCESS_STATE = "process-state";
    String PRODUCES = "produces";
    String PRODUCT_NAME = "product-name";
    String PRODUCT_VERSION = "product-version";
    String PROFILE = "profile";
    String PROFILE_NAME = "profile-name";
    String PROPERTIES = "properties";
    String PROPERTIES_REALM = "properties-realm";
    String PROPERTY = "property";
    String PROTOCOL = "protocol";
    String PROTOCOLS = "protocols";
    String PROVIDER = "provider";
    String PROVIDER_NAME = "provider-name";
    String PROVIDER_HTTP_SERVER_MECHANISM_FACTORY = "provider-http-server-mechanism-factory";
    String PROVIDER_LOADER = "provider-loader";
    String PROVIDER_MODULE = "provider-module";
    String PROVIDER_SASL_SERVER_FACTORY = "provider-sasl-server-factory";
    String PROXIES = "proxies";
    String PRUNE_EXPIRED = "prune-expired";
    String PRUNE_DISCONNECTED = "prune-disconnected";
    String QUERY = "query";
    String QUEUE = "queue";
    String QUEUE_ADDRESS = "queue-address";
    String QUEUE_LENGTH = "queue-length";
    String QUEUE_NAME = "queue-name";
    String QUEUE_SIZE = "queue-size";
    String RDN_IDENTIFIER = "rdn-identifier";
    String READ = "read";
    String READ_ATTRIBUTE_OPERATION = "read-attribute";
    String READ_BOOT_ERRORS = "read-boot-errors";
    String READ_CHILDREN_NAMES_OPERATION = "read-children-names";
    String READ_CHILDREN_RESOURCES_OPERATION = "read-children-resources";
    String READ_CHILDREN_TYPES_OPERATION = "read-children-types";
    String READ_CONTENT = "read-content";
    String READ_LOG_FILE = "read-log-file";
    String READ_ONLY = "read-only";
    String READ_RESOURCE_DESCRIPTION_OPERATION = "read-resource-description";
    String READ_RESOURCE_OPERATION = "read-resource";
    String READ_WRITE = "read-write";
    String REALM = "realm";
    String REALMS = "realms";
    String REALM_NAME = "realm-name";
    String REASON = "reason";
    String RECORD_REQUEST_START_TIME = "record-request-start-time";
    String RECOVERY_PLUGIN_CLASS_NAME = "recovery-plugin-class-name";
    String RECURSIVE = "recursive";
    String RECURSIVE_DEPTH = "recursive-depth";
    String REGEX_PRINCIPAL_TRANSFORMER = "regex-principal-transformer";
    String REGEX_VALIDATING_PRINCIPAL_TRANSFORMER = "regex-validating-principal-transformer";
    String REGISTERED = "registered";
    String REJECT_DUPLICATES = "reject-duplicates";
    String REJECTED_COUNT = "rejected-count";
    String REJECTED_SESSIONS = "rejected-sessions";
    String RELATIVE_TO = "relative-to";
    String RELAY = "relay";
    String RELEASE_CODENAME = "release-codename";
    String RELEASE_VERSION = "release-version";
    String RELOAD = "reload";
    String RELOAD_HOST = "reload-host";
    String RELOAD_REQUIRED = "reload-required";
    String RELOAD_SERVERS = "reload-servers";
    String REMOTE = "remote";
    String REMOTE_ADDRESS = "remote-address";
    String REMOTE_ACCEPTOR = "remote-acceptor";
    String REMOTE_COMMAND = "remote-command";
    String REMOTE_CONNECTOR = "remote-connector";
    String REMOVE_CONTENT = "remove-content";
    String REMOTE_DESTINATION_OUTBOUND_SOCKET_BINDING = "remote-destination-outbound-socket-binding";
    String REMOTING = "remoting";
    String REMOVE = "remove";
    String REMOVE_MESSAGE = "remove-message";
    String REMOVE_MESSAGES = "remove-messages";
    String REPLICATION_COLOCATED = "replication-colocated";
    String REPLICATION_MASTER = "replication-master";
    String REPLICATION_SLAVE = "replication-slave";
    String REPLY_PROPERTIES = "reply-properties";
    String REQUEST_CONTROLLER = "request-controller";
    String REQUEST_COUNT = "request-count";
    String REQUEST_PROPERTIES = "request-properties";
    String REQUIRED = "required";
    String REQUIRES = "requires";
    String RESET_CONFIGURATION = "reset-configuration";
    String RESET_STATISTICS_OPERATION = "reset-statistics";
    String RESOLVE_EXPRESSION = "resolve-expression";
    String RESOLVE_EXPRESSIONS = "resolve-expressions";
    String RESOLVE_EXPRESSION_ON_DOMAIN = "resolve-expression-on-domain";
    String RESOURCE_ADAPTER = "resource-adapter";
    String RESOURCE_ADAPTERS = "resource-adapters";
    String RESOURCE_METHODS = "resource-methods";
    String RESOURCE_PATH = "resource-path";
    String RESPONSE = "response";
    String RESPONSE_COUNT = "response-count";
    String RESPONSE_HEADERS = "response-headers";
    String REST_RESOURCE = "rest-resource";
    String REST_RESOURCE_PATHS = "rest-resource-paths";
    String RESTART = "restart";
    String RESTART_JOB = "restart-job";
    String RESTART_JOBS_ON_RESUME = "restart-jobs-on-resume";
    String RESTART_REQUIRED = "restart-required";
    String RESTART_SERVERS = "restart-servers";
    String RESULT = "result";
    String RESUME = "resume";
    String RESUME_SERVERS = "resume-servers";
    String ROLE = "role";
    String ROLE_MAPPING = "role-mapping";
    String ROLES = "roles";
    String ROLLBACK_OPERATION = "rollback";
    String ROLLBACK_TO = "rollback-to";
    String RUNNING_EXECUTIONS = "running-executions";
    String RUNNING_MODE = "running-mode";
    String RUNNING_TIME = "running-time";
    String RUNTIME = "runtime";
    String RUNTIME_NAME = "runtime-name";
    String SAME_RM_OVERRIDE = "same-rm-override";
    String SAR = "sar";
    String SASL_AUTHENTICATION_FACTORY = "sasl-authentication-factory";
    String SASL_PROTOCOL = "sasl-protocol";
    String SCHEDULED_COUNT = "scheduled-count";
    String SCHEDULED_THREAD_POOL_MAX_SIZE = "scheduled-thread-pool-max-size";
    String SCHEMA_LOCATIONS = "schema-locations";
    String SCRIPT = "script";
    String SEARCH_BASE_DN = "search-base-dn";
    String SEARCH_PATH = "search-path";
    String SECURE_INTERFACE = "secure-interface";
    String SECURE_PORT = "secure-port";
    String SECURE_SOCKET_BINDING = "secure-socket-binding";
    String SECURITY = "security";
    String SECURITY_DOMAIN = "security-domain";
    String SECURITY_MANAGER = "security-manager";
    String SECURITY_REALM = "security-realm";
    String SECURITY_SETTING = "security-setting";
    String SELECT = "select";
    String SELECTOR = "selector";
    String SEND_MESSAGE_TO_DEAD_LETTER_ADDRESS = "send-message-to-dead-letter-address";
    String SEND_MESSAGES_TO_DEAD_LETTER_ADDRESS = "send-messages-to-dead-letter-address";
    String SENSITIVE = "sensitive";
    String SERVER = "server";
    String SERVER_CONFIG = "server-config";
    String SERVER_GROUP = "server-group";
    String SERVER_GROUP_SCOPED_ROLE = "server-group-scoped-role";
    String SERVER_GROUPS = "server-groups";
    String SERVER_SSL_CONTEXT = "server-ssl-context";
    String SERVER_STATE = "server-state";
    String SERVER_TYPE = "server-type";
    String SERVICE = "service";
    String SERVICE_LOADER_HTTP_SERVER_MECHANISM_FACTORY = "service-loader-http-server-mechanism-factory";
    String SERVICE_LOADER_SASL_SERVER_FACTORY = "service-loader-sasl-server-factory";
    String SERVICES_MISSING_DEPENDENCIES = "services-missing-dependencies";
    String SERVICES_MISSING_TRANSITIVE_DEPENDENCIES = "services-missing-transitive-dependencies";
    String SERVLET = "servlet";
    String SERVLET_CONTAINER = "servlet-container";
    String SETTING = "setting";
    String SESSION_AVG_ALIVE_TIME = "session-avg-alive-time";
    String SESSION_COOKIE = "session-cookie";
    String SESSION_ID = "session-id";
    String SESSION_MAX_ALIVE_TIME = "session-max-alive-time";
    String SESSIONS_CREATED = "sessions-created";
    String SHARED_STORE_COLOCATED = "shared-store-colocated";
    String SHARED_STORE_MASTER = "shared-store-master";
    String SHARED_STORE_SLAVE = "shared-store-slave";
    String SHOW_HISTORY_OPERATION = "show-history";
    String SHUTDOWN = "shutdown";
    String SIMPLE_PERMISSION_MAPPER = "simple-permission-mapper";
    String SIMPLE_REGEX_REALM_MAPPER = "simple-regex-realm-mapper";
    String SIMPLE_ROLE_DECODER = "simple-role-decoder";
    String SINCE = "since";
    String SINGLE_SIGN_ON = "single-sign-on";
    String SINGLETON = "singleton";
    String SIZE_ROTATING_FILE_AUDIT_LOG = "size-rotating-file-audit-log";
    String SIZE_ROTATING_FILE_HANDLER = "size-rotating-file-handler";
    String SLAVE = "slave";
    String SMTP = "smtp";
    String SOCKET_BINDING = "socket-binding";
    String SOCKET_BINDING_DEFAULT_INTERFACE = "socket-binding-default-interface";
    String SOCKET_BINDING_GROUP = "socket-binding-group";
    String SOCKET_BINDING_PORT_OFFSET = "socket-binding-port-offset";
    String SOCKET_BINDING_REF = "socket-binding-ref";
    String SOURCE = "source";
    String SOURCE_CREDENTIAL_REFERENCE = "source-credential-reference";
    String SOURCE_NETWORK = "source-network";
    String SOURCE_PASSWORD = "source-password";
    String SPEC_NAME = "spec-name";
    String SPEC_VENDOR = "spec-vendor";
    String SPEC_VERSION = "spec-version";
    String SQL = "sql";
    String SSL = "ssl";
    String SSL_CONTEXT = "ssl-context";
    String STACK = "stack";
    String STALE_CONNECTION_CHECKER_CLASS_NAME = "stale-connection-checker-class-name";
    String STANDALONE = "standalone";
    String STANDARD_ROLE_NAMES = "standard-role-names";
    String START = "start";
    String START_DELIVERY = "start-delivery";
    String START_JOB = "start-job";
    String START_MODE = "start-mode";
    String START_SERVERS = "start-servers";
    String START_TIME = "start-time";
    String STARTED = "started";
    String STATE_TRANSFER = "state-transfer";
    String STATIC_CONNECTORS = "static-connectors";
    String STATISTICS_ENABLED = "statistics-enabled";
    String STATUS = "status";
    String STEPS = "steps";
    String STOP = "stop";
    String STOP_DELIVERY = "stop-delivery";
    String STOP_JOB = "stop-job";
    String STOP_SERVERS = "stop-servers";
    String STORAGE = "storage";
    String STORE = "store";
    String STREAM = "stream";
    String STRING = "string";
    String STYLESHEETS = "stylesheets";
    String SUB_RESOURCE_LOCATORS = "sub-resource-locators";
    String SUBDEPLOYMENT = "subdeployment";
    String SUBSCRIPTION_COUNT = "subscription-count";
    String SUBSYSTEM = "subsystem";
    String SUCCESS = "success";
    String SUGGEST_CAPABILITIES = "suggest-capabilities";
    String SUSPEND = "suspend";
    String SUSPEND_SERVERS = "suspend-servers";
    String SUSPEND_STATE = "suspend-state";
    String SYSLOG_AUDIT_LOG = "syslog-audit-log";
    String SYSLOG_HANDLER = "syslog-handler";
    String SYSTEM_PROPERTY = "system-property";
    String SYSTEM_PROPERTIES = "system-properties";
    String TABLE = "table";
    String TAIL = "tail";
    String TARGET = "target";
    String TARGET_CREDENTIAL_REFERENCE = "target-credential-reference";
    String TARGET_PASSWORD = "target-password";
    String TARGET_PATH = "target-path";
    String TASK_MAX_THREADS = "task-max-threads";
    String TEMPORARY = "temporary";
    String TEST_CONNECTION_IN_POOL = "test-connection-in-pool";
    String THREAD_FACTORY = "thread-factory";
    String THREAD_POOL = "thread-pool";
    String THREAD_POOL_MAX_SIZE = "thread-pool-max-size";
    String THROUGH = "through";
    String TIMEOUT = "timeout";
    String TIME_REMAINING = "time-remaining";
    String TIMER = "timer";
    String TIMERS = "timers";
    String TIMESTAMP = "timestamp";
    String TIMESTAMP_COLUMN = "timestamp-column";
    String TO = "to";
    String TO_PROFILE = "to-profile";
    String TOPIC_ADDRESS = "topic-address";
    String TOTAL_PROCESSING_TIME = "total-processing-time";
    String TOTAL_SIZE = "total-size";
    String TOKEN_REALM = "token-realm";
    String TRANSACTION = "transaction";
    String TRANSACTION_SUPPORT = "transaction-support";
    String TRANSACTION_TIMEOUT = "transaction-timeout";
    String TRANSACTION_TIMEOUT_SCAN_PERIOD = "transaction-timeout-scan-period";
    String TRANSACTIONS = "transactions";
    String TRANSPORT = "transport";
    String TRIM_DESCRIPTIONS = "trim-descriptions";
    String TRUST_CACERTS = "trust-cacerts";
    String TRUST_MANAGER = "trust-manager";
    String TRUST_MODULE = "trust-module";
    String TYPE = "type";
    String UNDEFINE_ATTRIBUTE_OPERATION = "undefine-attribute";
    String UNDEFINED = "undefined";
    String UNDEPLOY = "undeploy";
    String UNDERTOW = "undertow";
    String UNIT = "unit";
    String UNREGISTERED = "unregistered";
    String UPDATE_AUTO_START_WITH_SERVER_STATUS = "update-auto-start-with-server-status";
    String UPTIME = "uptime";
    String URL = "url";
    String USE_RECURSIVE_SEARCH = "use-recursive-search";
    String USER_NAME = "user-name";
    String USER_PASSWORD_MAPPER = "user-password-mapper";
    String USERS_PROPERTIES = "users-properties";
    String USERNAME = "username";
    String VALID_CONNECTION_CHECKER_CLASS_NAME = "valid-connection-checker-class-name";
    String VALIDATE = "validate";
    String VALIDITY = "validity";
    String VALUE = "value";
    String VALUE_TYPE = "value-type";
    String VERBOSE = "verbose";
    String VERSION = "version";
    String VIRTUAL_HOST = "virtual-host";
    String VM_NAME = "vm-name";
    String VM_VENDOR = "vm-vendor";
    String VM_VERSION = "vm-version";
    String WANT_CLIENT_AUTH = "want-client-auth";
    String WEBSERVICES = "webservices";
    String WEBSOCKET = "websocket";
    String WEBSOCKETS = "websockets";
    String WELCOME_FILE = "welcome-file";
    String WELD = "weld";
    String WHERE = "where";
    String WHOAMI = "whoami";
    String WM_SECURITY_MAPPING_GROUPS = "wm-security-mapping-groups";
    String WM_SECURITY_MAPPING_USERS = "wm-security-mapping-users";
    String WORKER = "worker";
    String WORKMANAGER = "workmanager";
    String WRITE = "write";
    String WRITE_ATTRIBUTE_OPERATION = "write-attribute";
    String WSDL_URL = "wsdl-url";
    String X500_ATTRIBUTE_PRINCIPAL_DECODER = "x500-attribute-principal-decoder";
    String X509_CREDENTIAL_MAPPER = "x509-credential-mapper";
    String XA_DATA_SOURCE = "xa-data-source";
    String XA_DATASOURCE_CLASS = "xa-datasource-class";
    String XML = "xml";
}

