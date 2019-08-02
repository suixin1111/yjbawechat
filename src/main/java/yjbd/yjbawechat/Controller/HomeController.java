package yjbd.yjbawechat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/LawDictionary")
public class HomeController {
    @RequestMapping("/Index")
    public String index(){
        return "/Record/ExecuteLawIndex";
    }


    @RequestMapping("/CheckSign")
    public String signature(){
        return "/Record/CheckSign";
    }
    @RequestMapping("/CheckPeopleSign")
    public String CheckPeopleSign(){
        return "/Record/CheckPeopleSign";
    }
    @RequestMapping("/test")
    public String test(){
        return "/Record/Test";
    }
    @RequestMapping("/TestCss")
    public String TestCss(){
        return "/Record/TestCss";
    }
    @RequestMapping("/MsgSuccess")
    public String msgSuccess(){
        return "/Record/MsgSuccess";
    }
    @RequestMapping("/RepresentSigh")
    public String representSigh(){
        return "/Record/RepresentSigh";
    }
    @RequestMapping("/TwoWeiCode")
    public String twoWeiCode(){
        return "/Record/TwoWeiCode";
    }

    /**
     * 被检查人预览文书页面
     * @return
     */
    @RequestMapping("/TestWeiCode")
    public String TestWeiCode(){
        return "/Record/TestWeiCode";
    }
    @RequestMapping("/ExpertSign")
    public String expertSign(){
        return "/Record/ExpertSign";
    }
    @RequestMapping("/WitnessSign")
    public String witnessSign(){
        return "/Record/WitnessSign";
    }
    @RequestMapping("/otherPdtPage")
    public String otherPdtPage(){
        return "/Record/otherPdtPage";
    }



    @RequestMapping("/PunishMeasure")
    public String PunishMeasure(){
        return "/ma/PunishMeasure";
    }
    @RequestMapping("/Signature0")
    public String Signature0(){
        return "/ma/Signature";
    }
    @RequestMapping("/Signature1")
    public String Signature1(){
        return "/ma/Signature1";
    }
    @RequestMapping("/Signature2")
    public String Signature2(){
        return "/ma/Signature2";
    }
    @RequestMapping("/Signature3")
    public String Signature3(){
        return "/ma/Signature3";
    }
    @RequestMapping("/OperatingSuccess")
    public String OperatingSuccess(){
        return "/ma/OperatingSuccess";
    }

    @RequestMapping("/Result")
    public String Result(){
        return "/ma/Result";
    }
    //预览文书页面
    @RequestMapping("/TestResult")
    public String TestResult(){
        return "/ma/TestResult";
    }




    @RequestMapping("/Rectification")
    public String Rectification(){
        return "/ma/Rectification";
    }
    @RequestMapping("/Signature4")
    public String Signature4(){
        return "/ma/Signature4";
    }
    @RequestMapping("/Signature5")
    public String Signature5(){
        return "/ma/Signature5";
    }
    @RequestMapping("/Signature6")
    public String Signature6(){
        return "/ma/Signature6";
    }
    //进行预览文书，被检查人再签名
    @RequestMapping("/TestResultRectification")
    public String TestResultRectification(){
        return "/ma/TestResultRectification";
    }
    @RequestMapping("/Signature7")
    public String Signature7(){
        return "/ma/Signature7";
    }
    @RequestMapping("/Signature8")
    public String Signature8(){
        return "/ma/Signature8";
    }
    @RequestMapping("/Signature9")
    public String Signature9(){
        return "/ma/Signature9";
    }
    @RequestMapping("/OperatingSuccess1")
    public String OperatingSuccess1(){
        return "/ma/OperatingSuccess1";
    }
    @RequestMapping("/Result1")
    public String Result1(){
        return "/ma/Result1";
    }
}
