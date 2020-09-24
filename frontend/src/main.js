import Vue from 'vue'
import vueMoment from 'vue-moment'
import App from './App.vue'
import store from './store'
import router from './router'
import Kakao from '@/store/modules/oauth/kakao.js'
import vuetify from './plugins/vuetify';

Vue.use(vueMoment)
Vue.config.productionTip = false
Kakao.actions.init()

new Vue({
  store,
  router,
  vuetify,
  render: h => h(App)
}).$mount('#app')
