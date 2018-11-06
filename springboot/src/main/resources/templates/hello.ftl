<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link href="/css/index.css" rel="stylesheet"/>
</head>
<body>
    <div class="container">
        <h2>${msg}</h2>
    </div>
    <div>
        <form action="/file" enctype="multipart/form-data" method="post">
            文件名：<input type="file" name="file" />
            <br/>
            <button>上传文件</button>
        </form>
    </div>
</body>
</html>