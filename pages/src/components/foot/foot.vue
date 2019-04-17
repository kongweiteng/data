<template>
    <ul class='nav'>
        <li v-for='(item,index)  in arr' :class='item.add_link'>
            <router-link :to='{name:item.url}' @click='navClick(index)'>
                <i class='icon' :class='index===1?item.iconClassActive:item.iconClass'></i>

                <span :class='{active:index===1}'>{{ item.title }}</span>
            </router-link>
        </li>
    </ul>
</template>

<script>
    // import { mapGetters } from 'vuex';

    export default {
        name: 'app-nav',
        data() {
            return {
                arr: [
                    {
                        title: '首页',
                        url: 'Financing',
                        iconClass: 'icon_index',
                        iconClassActive: 'icon_indexActive'
                    },
                    {
                        title: '产品列表',
                        url: 'ProductList',
                        iconClass: 'icon_product',
                        iconClassActive: 'icon_productActive'
                    }, {
                        title: '个人中心',
                        url: 'Personal',
                        iconClass: 'icon_user',
                        iconClassActive: 'icon_userActive'
                    }
                ]
            }
        }
    }
</script>

<!--<style lang='css' src='../../style/common.css' scoped></style>-->
<style scoped='less'>
    .nav {
        position: fixed;
        bottom: 0;
        left: 0;
        /*height: .76rem;*/
        width: 100%;
        background: #fff;
        border-top: 1px solid #dcdcdc;
        padding: .12rem 0;
    }

    .nav li {
        width: 33.33%;
        float: left;
        text-align: center;
        font-size: .24rem;
    }

    .nav li .icon {
        display: block;
        height: .44rem;
        width: 100%;
        margin: 0 auto;
    }

    /*.nav li .icon_index {*/
    /*  background: url('../../assets/icon_index.png') no-repeat center;*/
    /*  background-size: .41rem .4rem;*/
    /*}*/

    /*.nav li .icon_indexActive {*/
    /*  background: url('../../assets/icon_indexActive.png') no-repeat center;*/
    /*  background-size: .41rem .4rem;*/
    /*}*/

    /*.nav li .icon_product {*/
    /*  background: url('../../assets/icon_product.png') no-repeat center;*/
    /*  background-size: .32rem .42rem;*/
    /*}*/

    /*.nav li .icon_productActive {*/
    /*  background: url('../../assets/icon_productActive.png') no-repeat center;*/
    /*  background-size: .32rem .42rem;*/
    /*}*/

    /*.nav li .icon_user {*/
    /*  background: url('../../assets/icon_user.png') no-repeat center;*/
    /*  background-size: .44rem .44rem;*/
    /*}*/

    /*.nav li .icon_userActive {*/
    /*  background: url('../../assets/icon_userActive.png') no-repeat center;*/
    /*  background-size: .44rem .44rem;*/
    /*}*/

    .nav li span {
        display: block;
        color: #747682;
        padding-top: .20rem;
    }

    .nav li span.active {
        color: #D2A330;
    }
</style>
