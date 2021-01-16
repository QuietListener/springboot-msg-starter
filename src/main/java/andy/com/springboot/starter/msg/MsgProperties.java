package andy.com.springboot.starter.msg;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 定义MsgProperties配置类，用于封装application.properties或application.yml中的基础配置。这里关于短信发送的配置前缀统一采用msg。
 */

@ConfigurationProperties(prefix = "msg")
public class MsgProperties {
    private String url;
    private String accessKey;
    private String accessSecret;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }
}
