package org.example;

import org.example.DI.Inject;

public class AccountService {
    @Inject
    AccountRepository accountRepository;

    public void join(){
        System.out.println("service.join");
        accountRepository.save();;
    }

}
