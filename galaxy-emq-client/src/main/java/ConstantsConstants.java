/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class ConstantsConstants {

  /**
   * client端请求超时时间（ms）
   */
  public static final int DEFAULT_CLIENT_SOCKET_TIMEOUT = 60000;

  /**
   * client端连接超时时间（ms）
   */
  public static final int DEFAULT_CLIENT_CONN_TIMEOUT = 30000;

  /**
   * HTTP RPC服务地址
   */
  public static final String DEFAULT_SERVICE_ENDPOINT = "http://awsbj0.emq.api.xiaomi.com";

  /**
   * HTTPS RPC服务地址
   */
  public static final String DEFAULT_SECURE_SERVICE_ENDPOINT = "https://awsbj0.emq.api.xiaomi.com";

  /**
   * Queue操作RPC路径
   */
  public static final String QUEUE_SERVICE_PATH = "/v1/api/queue";

  /**
   * Message操作RPC路径
   */
  public static final String MESSAGE_SERVICE_PATH = "/v1/api/message";

  /**
   * Statistics操作RPC路径
   */
  public static final String STATISTICS_SERVICE_PATH = "/v1/api/statistics";

  public static final String XIAOMI_HEADER_PREFIX = "x-xiaomi-";

  public static final String MI_DATE = "x-xiaomi-date";

  public static final String GALAXY_ACCESS_KEY_ID = "GalaxyAccessKeyId";

  public static final String SIGNATURE = "Signature";

  public static final String AUTHORIZATION = "authorization";

  public static final String CONTENT_MD5 = "content-md5";

  public static final String CONTENT_TYPE = "content-type";

  public static final String DATE = "date";

  public static final String RANGE = "range";

  public static final String USER_AGENT = "user-agent";

  public static final String HOST = "host";

  public static final String TIMESTAMP = "x-xiaomi-timestamp";

  public static final String CONTENT_LENGTH = "content-length";

}