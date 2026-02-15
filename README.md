# Sakiko

直接看效果

A. 业务代码使用Kotlin实现
![img.png](readme_src/img_3.png)

B. ArkTS代码通过knoi接口调用Kotlin代码
![img_1.png](readme_src/img_1.png)

C. 运行结果
![img_2.png](readme_src/img_2.png)

change 1:
A special Kotlin version provided by Tencent is reqruied to enable ohosArm64 compilation. The follwing has been done to accompany this:

- Kotlin version - 2.0.21-KBA-010
- CMP version - 1.7.0 (as higher version requires minimum Kt of 2.1.0)
- Add Tencent maven repo

note 1:
OHOS *so library linking task needs to be configured manually
![img.png](readme_src/img.png)

change 2:
Declare dependency of ksp and knoi for auto generate kt/native-ohos bridge

note 2:
Hvigor acts funny when exporting custom d.ts file, so in the gradle there's a rename op to change consumer.d.ts to consumer.ets and tbh I'm lazy enough to investigate why