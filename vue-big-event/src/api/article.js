import request from '@/utils/request.js'
import {useTokenStore} from "@/stores/token.js"

//文章分类列表查询
export const articleCategoryListService = ()=>{
    const tokenStore=useTokenStore();

    //在pinia中定义的响应式数据,不需要.value
    request.get('/category',{headers:{'Authorization':tokenStore.token}})
}