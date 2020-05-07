package com.yeeun.web.admin;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public interface AdminService {


    public void register(Admin admin);

    public List<Admin> findAll();

    public Admin findOne(String employNumber);

    public void modify(Admin admin);

    public void remove(Admin admin);

}