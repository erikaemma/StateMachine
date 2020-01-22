# 使用方法

## 简介

仿照Unity的Mecanim动画状态机实现的状态机模式。

参考：[flycash - 状态机的两种实现模式](https://www.jianshu.com/p/55e29a21679a)

## 编写状态类

1. 确定一组状态（State），抽象出公共方法
2. 基于AbstractEvent编写包含公共方法的抽象类BaseState
3. 基于BaseState编写这组State的实现

## 编写过渡条件类

1. 类似于BaseState，基于AbstractEvent编写过渡事件的公共方法类BaseEvent，如获取键盘输入
2. 基于两个State——A、B，编写过渡Event的具体实现
3. 假设A发出的多个过渡Event需要共享变量（如键盘输入，即在多个Event中共享输入），请在State A中设定变量

## 连接起来

1. 使用一个State实例化StateMachine
2. 实例化一个Transition
3. 调用这个Transition的addTrigger方法添加一组Event
4. 调用这个StateMachine的addTransition方法添加这个Transition
5. 重复2-4步，配置完这个State发出的所有Transition
6. 重复1-5步，配置完所有State
7. 使用第一个初始State来实例化Entry对象

TODO：
1. 暂时无法在State之间共享变量，只能第三方介入
2. 连接步骤过于繁琐