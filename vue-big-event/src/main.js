import './assets/main.scss'

import { createApp } from 'vue'

// 导入elementplus
import ElementPlus from 'element-plus'
// 导入样式
import 'element-plus/dist/index.css'
import router from '@/router'

import App from './App.vue'

import {createPinia} from "pinia"
import {createPersistedState} from "pinia-persistedstate-plugin"

const app =createApp(App);
const pinia = createPinia();
const persist=createPersistedState();
pinia.use(persist)
app.use(pinia)
app.use(router)
app.use(ElementPlus);
app.mount('#app')
