package com.zujuba.springbasic.people;

import com.zujuba.domain.userLogin;
import com.zujuba.domain.userbasic;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class testuse2 {

    @RequestMapping(value = "/namefalse")
    String getName1(@RequestParam(value = "person", required = false) String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }


    @RequestMapping(value = "/nametrue")
    String getName2(@RequestParam(value = "person", defaultValue = "John") String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }


    @RequestMapping(value = "/testparams",method = RequestMethod.GET,params = "a=123")
    String testparamsGET(@RequestParam(value = "person", defaultValue = "John") String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }

    @RequestMapping(value = "/testparams",method = RequestMethod.POST,params = "a=123")
    String testparamsPOST(@RequestParam(value = "person", defaultValue = "John2") String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }

    @RequestMapping(value = "/testparams1",method = RequestMethod.GET,params = "123")
    String testparamsGET1(@RequestParam(value = "person", defaultValue = "John3") String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }

    @RequestMapping(value = "/testparams1",method = RequestMethod.POST,params = "123")
    String testparamsPOST1(@RequestParam(value = "person", defaultValue = "John4") String personName) {
        System.out.println("person is " + personName);
        return "Required element of request param";
    }


    @RequestMapping(value = "/testparams1",method = RequestMethod.POST, headers="a=123")
    String testheadersPOST1(@RequestParam(value = "person", defaultValue = "John5") String personName) {
        System.out.println("testheadersPOST1 is " + personName);
        return "Required element of request param";
    }


    @RequestMapping(value = "/testparams2",method = RequestMethod.POST, headers="a=123 , b=234 ")
    String testheadersPOST2(@RequestParam(value = "person", defaultValue = "John6") String personName) {
        System.out.println("testheadersPOST2 is " + personName);
        return "Required element of request param";
    }

    @RequestMapping(value = "/bodytestjson" , method = RequestMethod.POST ,consumes = "application/json")
    @ResponseBody
    public testuseclass reciveBodyTest(@RequestBody testuseclass userlogin){
        System.out.println("reciveBodyTest is " + userlogin.getId());
        System.out.println("reciveBodyTest is " + userlogin.getName());
        return userlogin;
    }


    @RequestMapping(value = "/bodytesttext" , method = RequestMethod.POST ,consumes = "text/plain")
    @ResponseBody
    public testuseclass reciveBodyTest1(@RequestBody testuseclass userlogin){
        System.out.println("reciveBodyTest1 is " + userlogin);
        return userlogin;
    }
}
