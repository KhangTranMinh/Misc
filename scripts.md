# Sign AAB
`jarsigner` is located in `/Library/Android/sdk/build-tools`
```
jarsigner -verbose \
  -sigalg SHA256withRSA \
  -digestalg SHA-256 \
  -keystore '[keystore path]' \
  -signedjar '[output path]' \
  '[input path]' \
  '[key alias]'
```

# Sign APK
`apksigner` is located in `/Library/Android/sdk/build-tools`
```
apksigner sign \
  --ks [keystore path] \
  --ks-key-alias [key alias] \
  --ks-pass pass:[password] \
  --key-pass pass:[password] \
  --out [output path] \
  [input path]
```
