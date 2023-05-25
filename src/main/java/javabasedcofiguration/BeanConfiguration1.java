package javabasedcofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobeans.AccountService;

@Configuration
public class BeanConfiguration1 {

    @Bean
    public AccountService accountService(){
        AccountServiceImp3 bean = new AccountServiceImp3();
        bean.setAccountRepository(accountDao());
        return bean;
    }
    @Bean
    public AccountRepositoryImp3 accountDao(){
        AccountRepositoryImp3 bean = new AccountRepositoryImp3();
        return bean;
    }

}
