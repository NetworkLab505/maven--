$(function () {
    $("#login_id").dialog({
        closable:false,
        modal:true,
        buttons:[{text:'登录',handler:function () {
            }},{text:'注册',handler:
                function () {
                    $("#login_id").dialog('close');
                    $("#register_id").dialog({
                        modal:true,
                        width:500,
                        height:300,
                        buttons:[{
                            text:'登录',
                            handler:function () {
                                $("#register_id").dialog('close');
                                $("#login_id").dialog('open');
                            }
                        }, {text:'注册',
                            handler:function () {

                            }
                        }]
                    })
                },
        }],
    });
    //增加回车提交功能
    $("#loginInput").find('input').on('keyup',function () {
        if(event.keyCode==13)
        {loginInput.submit();}
    });
    $("#registerInput").find('input').on('keyup',function () {
        if(event.keyCode==13)
        {loginInput.submit();}
    });
});