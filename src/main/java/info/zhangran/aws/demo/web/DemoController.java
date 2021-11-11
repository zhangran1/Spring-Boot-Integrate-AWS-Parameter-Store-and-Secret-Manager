package info.zhangran.aws.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@EnableAutoConfiguration
public class DemoController {

  @Value("${dynamodb.access.key}")
  private String dynamodbAccessKey;

  @Value("${exploreparamstore.device.token}")
  private String deviceToken;


  @Value("${username}")
  private String username;


  @GetMapping("/parameter")
  public ResponseEntity<String> getParam() {
    log.info("Parameter Store DyamoDB Access Key {}", dynamodbAccessKey);
    log.info("Parameter Store Device Token {}", deviceToken);
    log.info("Secret Manager test1's value {}", username);

    return ResponseEntity.ok("hello");
  }

}
