<script setup lang="ts">

</script>

<template>
  <el-header>
    <el-menu
        mode="horizontal"
        router
    >
      <el-menu-item index="/">Home</el-menu-item>
      <el-menu-item index="/write">글작성</el-menu-item>
    </el-menu>
  </el-header>
</template>

<style scoped>
header {
  margin: 0;
  height: 60px;
  padding: 0;
}
</style>