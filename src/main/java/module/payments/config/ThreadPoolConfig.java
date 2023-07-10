package module.payments.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setMaxPoolSize(5); //최대 쓰레드 수
        threadPoolTaskExecutor.setCorePoolSize(5); //기본 쓰레드 풀 크기
        threadPoolTaskExecutor.initialize();

        threadPoolTaskExecutor.setThreadNamePrefix("async-task");
        threadPoolTaskExecutor.setThreadGroupName("async-group");

        return threadPoolTaskExecutor;
    }
}
