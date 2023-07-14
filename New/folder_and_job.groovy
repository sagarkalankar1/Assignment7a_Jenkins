folder('MyFolder1') {
  displayName('My Folder1')
  
  job('MyChildJob') {
    displayName('Child Job')
    // Additional configuration for the child job
  }
}
