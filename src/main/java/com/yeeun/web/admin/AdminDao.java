package com.yeeun.web.admin;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface AdminDao {

    void insert(Admin admin);

    List<Admin> selectAll();

    Admin selectOne(String employNumebr);

    void update(Admin admin);

    void delete(Admin admin);

}