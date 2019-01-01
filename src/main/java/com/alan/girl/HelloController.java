package com.alan.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接下来我们创建一个HelloController.java,
 * @ RestController 这个注解的作用： 声明这是一个Controller类，返回json
 * 其实就是@ResponseBody和@Controller的结合体。
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private  String cupSize;
    @Value("${height}")
    private  int height;

    @Value("${girl.age}")
    private  int age;

    @Value("${content}")
    private  String content;

    //Controller类读取GirlProperties，
    //我们要使用@Autowired注入GirlProperties这个类的实例，它是通过bean的类型注入的

    @Autowired
    private GirlProperties girlProperties;

    /***
     * 尽量使用@GetMapping 和 @PostMapping
     * 代替 @RequestMapping(value = "/xxxxx", method = RequestMethod.GET)
     */
    //@RequestMapping(value = "con",method = RequestMethod.GET)
    @GetMapping(value = "con")
    public String getCon(){
        //System.out.println("cupSize="+cupSize+"+++height="+height+"+++age="+age+"+++content="+content);
        return "cupSize="+cupSize+"+++height="+height+"+++age="+age+"+++content="+content;
    }

    @RequestMapping(value = "girl",method = RequestMethod.GET)
    public String getGirl(){
        return "girl="+girlProperties.getAge()+"+++"+girlProperties.getCupSize();
    }

    @RequestMapping(value ="/say" ,method = RequestMethod.GET)
    public  String getSay(){
        return  "hello 帅哥！！！";
    }


}
