package org.example.simpledms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;

/**
 * packageName : org.example.simpledms.config
 * fileName : RedisConfig
 * author : GGG
 * date : 2024-04-08
 * description : 레디스 DB 상세 설정 자바파일
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-08         GGG          최초 생성
 */
@Configuration
public class RedisConfig {

    //    레디스 DB IP 속성(필드)
    @Value("${redis.host}")
    private String redisHost;

    //    레디스 DB Port 속성(필드)
    @Value("${redis.port}")
    private int redisPort;

//    1) 레디스 DB(메모리DB) 접속정보
//    2) 각 조회에서 사용할 키이름 설정 : dept, emp 등
//    3) 만료시간(ttl) 설정

//    레디스 DB 기본 설정을 위한 함수
    private RedisCacheConfiguration myDefaultCacheConfig(Duration duration) {
        return RedisCacheConfiguration          // 레디스 DB 캐쉬(성능향상) 설정 클래스
                .defaultCacheConfig()           // 아래 만료시간 등의 추가 설정을 기본으로 하겠다는 함수
                .entryTtl(duration)             // 만료시간 설정 함수
//                java 클래스 -> json(js 객체)[잭슨 패키지] -> 레디스 DB 용 데이터(키, 값)
//                변환규칙을 설정하는 함수
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
    }

//    레디스 DB 상세 설정
    @Bean
    public RedisCacheManager cacheManager() {

//        Duration 클래스 : 특정 시간을 설정하는 클래스
//        사용법 : Duration.ofMinutes(분) => 분이 설정되어 객체가 생성됨
        RedisCacheConfiguration cacheConfig =
                myDefaultCacheConfig(Duration.ofMinutes(10))  // 만료시간 10분으로 설정 (모든 키에 대해)
                .disableCachingNullValues();                  // 캐싱할때 null 은 제외하겠다는 설정

        return RedisCacheManager.builder(redisConnectionFactory()) // 레디스 DB 연결(ip, port)
                .cacheDefaults(cacheConfig)                        // 위에 cacheConfig 변수 적용
//                특정 키에 대해 추가 설정하는 부분 : depts, dept, emps, emp
//                depts 키 : 만료시간 5분
                .withCacheConfiguration("depts", myDefaultCacheConfig(Duration.ofMinutes(5)))
//                dept 키 : 만료시간 3분
                .withCacheConfiguration("dept", myDefaultCacheConfig(Duration.ofMinutes(3)))
//                emps 키 : 만료시간 5분
                .withCacheConfiguration("emps", myDefaultCacheConfig(Duration.ofMinutes(5)))
//                emp 키 : 만료시간 3분
                .withCacheConfiguration("emp", myDefaultCacheConfig(Duration.ofMinutes(3)))
                .build();
    }

//    레디스 DB 접속 설정하는 함수 : ip, port 설정
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(redisHost, redisPort);

        return new LettuceConnectionFactory(configuration);
    }
}
