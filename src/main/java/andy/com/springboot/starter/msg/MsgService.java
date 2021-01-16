package andy.com.springboot.starter.msg;


public class MsgService {

    /**
     * 访问发送短信的url地址
     */
    private String url;

    /**
     * 短信服务商提供的请求keyId
     */
    private String accessKeyId;

    /**
     * 短信服务商提供的KeySecret
     */
    private String accessKeySecret;

    public MsgService(String url, String accessKeyId, String accessKeySecret) {
        this.url = url;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    public int sendMsg(String msg) {
        // 调用http服务并发送消息，返回结果
        return HttpClientUtils.sendMsg(url, accessKeyId, accessKeySecret, msg);
    }

}
