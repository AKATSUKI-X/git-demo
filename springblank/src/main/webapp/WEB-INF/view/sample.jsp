
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/springblank/resources/js/jquery.min.js"></script>
<script type="text/javascript">
function change(){
	    var value = $("#myinput").val();
        $.ajax({
            type: "POST",
            url: "/springblank/sample/change",
            data: {inputvalue:value},
            dataType: "json",
            success: function(msg) {
            	$("#myfont").html(msg)
            }
        });
};
</script>
</head>
<body>
  入力：<input id="myinput" type="text" onkeyup="change()"/>
  結果：<font id="myfont"></font>
</body>
