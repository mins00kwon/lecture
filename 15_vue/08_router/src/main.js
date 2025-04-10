import { createApp } from 'vue'
import App from './App.vue'
import router from './router/01_router.js';

// npm install vue-router@next
// 라우터를 위해 실행해야 하는 코드
// 현재 프로젝트 선택 후 실행 할 것


// createApp(App).use(router).mount('#app')
// 가독성과 유지보수성을 위해 위의 코드를 아래처럼 쓴다
const app=createApp(App);
app.use(router);
app.mount('#app');
