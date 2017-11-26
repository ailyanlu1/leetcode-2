
var combine_recursive = function(arr,result,start,single_result, index,n ,arr_len){
    for(let ct = start;ct < arr_len-index+1;ct++){
        single_result[n-index] = ct;
        if(index===1){
            result.push(single_result.map(item=>arr[item]));
        }
        else{
            combine_recursive(arr,result,ct+1,single_result,index-1,n,arr_len);
        }
    }
};

var do_combine = function (arr) {
    let result = [];
    for(let n = 1;n<=arr.length;n++){
        let start = 0;
        let single_result = [];
        combine_recursive(arr,result,start,single_result,n,n,arr.length);
        // result.push(single_result);
    }
    return result;
};


//测试代码
var combines_multi;
tryList.forEach(t=>{
    if(t.quizTypeId === "itt004" && typeof(t.rightAnswer) === 'undefined'){
        combines_multi = do_combine(t.options);
    }
});