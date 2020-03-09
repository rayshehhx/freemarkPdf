package com.demo.yao.pdfdemo.controller;

import com.demo.yao.pdfdemo.utils.PDFTemplateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yaoerfei
 * @Description:
 * @Date: Created in 下午2:10 2020/3/8
 * @Version:
 * @Modified By :
 */

@Controller
@RequestMapping("/pdf")
public class PdfController {


    @RequestMapping(value = "/export",method = RequestMethod.GET)
    public void exportPdf(HttpServletResponse response) throws Exception {
        ByteArrayOutputStream baos = null;
        OutputStream out = null;
        String s="你院（20XX）X法执X字第XX号执行裁定书，（20XX）X法X字第XX号协助执行通知书收悉，我行处理结果如下：\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "被执行人（或其他法律地位）XXX在我行XXXX账户内的存款已被冻结，已冻结可用金额人民币XX元，额度冻结金额人民币XX元。冻结期限自X年X月X日X时X分至X年X月X日X时X分。\n" +
                "......\n" +
                "上述账户中，被执行人 XXX的XXXX账户为 xxx账户，权利人 XXX对账户中的XX(存款/资产)XXX元享有XXX权（权利类型）.\n" +
                "....\n" +
                "因XX原因，被执行人XXX在我行XXXX账户内的存款未能冻结。";
        try {
            // 模板中的数据，实际运用从数据库中查询
            Map<String,Object> data = new HashMap<>();
            data.put("bankName", "河南省金水区");
            data.put("text", s);
            data.put("date", new Date());

            baos = PDFTemplateUtil.createPDF(data, "/xiezhuzhixingtongzhishu.ftl");
            // 设置响应消息头，告诉浏览器当前响应是一个下载文件
            response.setContentType("application/x-msdownload");
            // 告诉浏览器，当前响应数据要求用户干预保存到文件中，以及文件名是什么 如果文件名有中文，必须URL编码
            String fileName = URLEncoder.encode("协助执行通知书.pdf", "UTF-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            out = response.getOutputStream();
            baos.writeTo(out);
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("导出失败：" + e.getMessage());
        } finally {
            if (baos != null) {
                baos.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
