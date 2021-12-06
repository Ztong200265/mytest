package edu.soft2.contoller;

import edu.soft2.pojo.User;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @RequestMapping("logout")
    public  String  logout(HttpServletRequest request){
        System.out.println("----logout()----");
        HttpSession session=request.getSession();
        System.out.println("session失效");
        String msg="你已退出登录";
        request.setAttribute("msg",msg);

        return "forward:index.jsp";
    }
    @RequestMapping(value = "/delete")
    public String delete(){
        System.out.println("----delete()----");
        return "hello";
    }

    //登录
    @RequestMapping(value = "login")
    public String login(User user, HttpSession session){
        System.out.println("----login()----");
        int flag = 1;//调用业务层,获取返回值
        if (flag == 1) {
            session.setAttribute("user",user);
            return "welcome";

        }
        return "hello";
    }

    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("----hello()----");
        return "hello";
    }
    @RequestMapping(value = "upload",method = {RequestMethod.POST})
    public  String upload(MultipartFile image,HttpServletRequest request) throws IOException {
        System.out.println("----upload()----");
     InputStream is=image.getInputStream();
     String filename=image.getOriginalFilename();
     String realPath= request.getServletContext().getRealPath("images");
     System.out.println("上传路径"+realPath);
      String newname=doFilename(filename);
        OutputStream os=new FileOutputStream(new File(realPath,filename));
          int size= IOUtils.copy(is,os);
        System.out.println("上传"+""+"文件到"
                +realPath+"完毕,共计"+size+"章节，上传后文件改名为"+newname+"'。'");
        os.close();is.close();
        return "welcome";
    }
    private  String doFilename(String filename){
        String extension= FilenameUtils.getExtension(filename);
        String uuid= UUID.randomUUID().toString();


        return uuid+"."+extension;
    }
    @RequestMapping(value = "/2upload",method = {RequestMethod.POST})
    public  String upload2(MultipartFile[] image,HttpServletRequest request) throws IOException {
        System.out.println("----upload2()----");
        InputStream is = null;
        OutputStream os = null;
        for (MultipartFile imageFile : image) {

            is = imageFile.getInputStream();
            String filename = imageFile.getOriginalFilename();
            String realPath = request.getServletContext().getRealPath("images");
            System.out.println("上传路径" + realPath);
            String newname = doFilename(filename);
               os = new FileOutputStream(new File(realPath, filename));
            int size = IOUtils.copy(is, os);
            System.out.println("上传" + "" + "文件到"
                    + realPath + "完毕,共计" + size + "章节，上传后文件改名为" + newname + "'。'");

        }
        os.close();
        is.close();
        return "welcome";
    }
}


