import './assets/main.scss'

import { createApp } from 'vue'

// 导入elementplus
import ElementPlus from 'element-plus'
// 导入样式
import 'element-plus/dist/index.css'
import router from '@/router'

import App from './App.vue'

const app =createApp(App)
app.use(router)
app.use(ElementPlus);
app.mount('#app')
