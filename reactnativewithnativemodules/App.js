import { StyleSheet, Text, View, Button } from 'react-native'
import React from 'react'
import MyCustomModule from './MyCustomModule'

const App = () => {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center', }} >

      <Text>App</Text>
      <Button onPress={()=>MyCustomModule.showToast('Hello From Native Modules')} title='Show Toast' />
    </View>
  )
}

export default App

const styles = StyleSheet.create({})