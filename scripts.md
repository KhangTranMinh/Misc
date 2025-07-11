# Sign AAB
```
jarsigner -verbose \
  -sigalg SHA256withRSA \
  -digestalg SHA-256 \
  -keystore '[keystore path]' \
  -signedjar '[output path]' \
  '[input path]' \
  '[key alias]'
```
