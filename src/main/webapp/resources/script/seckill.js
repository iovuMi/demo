//存放主要的交互逻辑js代码
//javascript 模块化
var seckill = {
    //封装秒杀相关url
    URL: {},
    validatePhone: function (phone) {
        if (phone && phone.length == 11 && !isNaN(phone)) {
            return true;
        } else {
            return false;
        }
    },
    detail: {
        //详情页初始化
        init: function (params) {
            //手机验证,计时
            //规划交互流程
            //在cookies查找手机号
            var killPhone = $.cookie('killPhone');

            var endTime = params['endTime'];
            var startTime = params['startTime'];
            var seckillId = params['seckillId'];
            //验证手机号
            if (!seckill.validatePhone(killPhone)) {
                //绑定手机号
                var killPhoneModal = $('#killPhoneModal');
                killPhoneModal.modal({
                    show: true,//显示弹出层
                    backdrop: 'static',//禁止位置关闭
                    keyboard: false//关闭键盘
                });
                $('#killPhoneBtn').click(function () {
                    var inputPhone = $('#killPhoneKey').val();

                    console.log('inputPhone='+inputPhone);//TODO
                    if (seckill.validatePhone(inputPhone)) {
                        $.cookie('killPhone', inputPhone, {expires: 7, path: '/seckill'});
                        window.location.reload();
                    } else {
                        $('#killPhoneMessage').hide().html('<label class="label label-danger">手机号错误!</label>').show(300);
                    }
                });
            }

        }
    }
}