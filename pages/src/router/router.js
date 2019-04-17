import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)


export const constantRouterMap = [
    {
        path: '/hello',
        name: 'hello',
        component: () =>
            import('../components/HelloWorld.vue'),
        meta: {
            title: 'hello',
            // icon: 'iconfont icon-ziyuan'
        },
    },
    {
        path: '',
        redirect: '/hello',
        hidden: true,
    },

]


export default new VueRouter({
    // mode: 'history',
    scrollBehavior: () => ({
        y: 0
    }),
    routes: constantRouterMap
})