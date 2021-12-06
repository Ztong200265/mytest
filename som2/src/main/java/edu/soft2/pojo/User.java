package edu.soft2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.mail.Address;
import javax.xml.ws.soap.Addressing;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String username;
    String pwd;
    int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthday;//springmvc进行类型转换
    Addressing address;//自定义对象类
}
