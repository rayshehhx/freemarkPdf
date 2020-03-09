<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>协助执行通知书</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: SimSun;
        }

        section {
            display: block;
            margin: 20px 10px;
        }

        .title {
            text-align: center;
        }

        .preface p {
            line-height: 30px;
        }

        .preface p.content {
            text-indent: 2em;
        }

        /*div.header {*/
        /*display: block;*/
        /*text-align: center;*/
        /*position: running(header);*/
        /*}*/

        div.footer {
            display: block;
            text-align: center;
            position: running(footer);
        }

        @page {
            @top-center {
                content: element(header)
            }
        }

        @page {
            @bottom-center {
                content: element(footer)
            }
        }

        .pageNext {
            page-break-after: always;
        }

        #pagenumber:before {
            content: counter(page);
        }

        #pagecount:before {
            content: counter(pages);
        }

        .pageNext {
            page-break-after: always;
        }

        #pagenumber:before {
            content: counter(page);
        }

        #pagecount:before {
            content: counter(pages);
        }
    </style>
</head>
<body>
<#--<div class='header'>Header</div>-->
<div class="footer">第 <span id="pagenumber"/> / <span id="pagecount"/> 页</div>
<#--<div class="pageNext"></div>-->

<div class="pageNext">
    <!-- 标题 start -->
    <section class="title">
        <h2>${bankName}人民法院</h2>
        <h2>协助执行通知书</h2>
        <h2>（回执）</h2>
    </section>
    <!-- 标题 end -->

    <!-- 前言 start -->
    <section class="preface">
        <p>${bankName}人民法院：</p>
        <p class="content">${text}</p>
    </section>
    <!-- 前言 end -->

    <!-- 汇总统计信息 start -->
    <section class="count-info">
        <p>${bankName}人民法院：</p>
        <p class="content">${text}</p>
    </section>
    <!-- 汇总统计信息 end -->


    <!-- 明细 start -->
    <section class="count-info">
        <p>${bankName}人民法院：</p>
        <p class="content">${text}</p>
    </section>
    <!-- 明细 end -->

    <div align="right">
        ${date?string("yyyy年MM月dd日HH时mm分ss秒")}
        <br/>
        <br/>
        <img src="images/yinzhang.png" width="20%"/>
        <br/>
        <br/>
        <br/>
        <br/>
    </div>

</div>
</body>
</html>