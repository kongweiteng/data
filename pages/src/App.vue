<template>
    <div id="app">
        <left></left>
        <router-view>
        </router-view>
        <foot></foot>
    </div>
</template>

<script>
    // import HelloWorld from './components/HelloWorld.vue'

    import foot from '@/components/foot/foot.vue'
    import left from '@/components/left/left.vue'

    export default {
        name: 'app',
        components: {
            // HelloWorld
            foot,
            left
        }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>
