package yjbd.yjbawechat.Util;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 08:30 2019/7/31
 * @ Description：${description}
 * @ Modified By：
 */
public class LenUtil {
    public static String addLen(String code,int len){
        Integer intHao = Integer.parseInt(code);
        String strHao = intHao.toString();
        while (strHao.length() < len) {
            strHao = "0" + strHao;
        }
        return strHao;
    }
}
