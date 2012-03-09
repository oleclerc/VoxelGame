uniform mat4 g_WorldViewProjectionMatrix;

attribute vec3 inPosition;
attribute vec4 inColor;
attribute vec2 inTexCoord;
attribute float inSize;

varying vec4 color;

#ifdef USE_TEXTURE
varying vec2 texCoord;
#endif

void main(){
    gl_Position = g_WorldViewProjectionMatrix * vec4(inPosition, 1.0);
    //gl_PointSize = inSize;
    color = inColor;

    #ifdef USE_TEXTURE
        texCoord = inTexCoord;
    #endif
}