
(function ($) {
    "use strict";

    
    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-input .input100');

    $('.validate-form').on('submit', function(event) {
        event.preventDefault();
        console.log(event)
        console.log(this.elements)

        var data = {
            email: this.elements.email.value,
            pass: this.elements.pass.value
        }
        var xhr = new XMLHttpRequest();
        xhr.open(this.method, this.action, true);
        xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
        var formData = JSON.stringify(data);
        xhr.send(formData);
    });


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
           hideValidate(this);
        });
    });

    function validate (input) {
        if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }

    function submitform(a) {
            console.log(a);
            alert("Sending Json");
    }


})(jQuery);