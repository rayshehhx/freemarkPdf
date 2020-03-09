<html>
<head>
    <title>协助执行通知书</title>
    <meta charset="utf-8"></meta>
    <meta name="viewport" content="width=device-width, initial-scale=1"></meta>
    <meta http-equiv="x-ua-compatible" content="ie=edge"></meta>
    <link rel="icon" href="https://static.jianshukeji.com/hcode/images/favicon.ico"></link>
    <script src="https://img.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
    <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
</head>
<body>

<#-- 单个属性 替换   -->
<h1>${bankName}人民法院</h1>
<h1>协助执行通知书</h1>
<h1>（回执）</h1>

${bankName}人民法院<br/>
<div>
    ${text}
</div>
${date?string("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒")} <br/>
</body>
</html>