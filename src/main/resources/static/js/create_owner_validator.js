jQuery(function ($) {
    $('#ownerForm').validate({
        rules: {
            ssn: {
                required: true,
                minlength: 9,
                maxlength: 9,
                digits: true
            },
            firstname: {
                required: true
            },
            lastname: {
                required: true
            },
            address: {
                required: true
            },
            phone_number:{
                required: true,
                minlength: 10,
                maxlength: 10,
                digits: true

            },
            email: {
                required: true,
                email: true
            },
            password: {
                required: true
            },
        },
        messages: {
            ssn: {
                required: 'Please enter your Ssn',
                minlength: 'Ssn should be 9 numbers',
                maxlength: 'Ssn should be 9 numbers',
                digits: 'Ssn should contain only numbers'
            },
            phone_number: {
                required: 'Please enter your phone number',
                minlength: 'Phone number should be more than 10 numbers',
                maxlength: 'Phone number should be more than 10 numbers',
                digits: 'Phone number should contain only digits'
            }
        }
    });
});