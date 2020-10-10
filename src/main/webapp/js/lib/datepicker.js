$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
    weekStart: 1,
//    dateFormat: 'yy-mm-dd',
    daysOfWeekHighlighted: "6,0",
    autoclose: true,
    todayHighlight: true
});
$('.datepicker').datepicker("setDate", new Date());
