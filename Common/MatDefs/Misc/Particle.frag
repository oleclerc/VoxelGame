#ifdef USE_TEXTURE
uniform sampler2D m_Texture;
varying vec2 texCoord;
#endif

varying vec4 color;


void main(){
    #ifdef USE_TEXTURE
        gl_FragColor = texture2D(m_Texture, texCoord) * color;
    #else
        gl_FragColor = color;
    #endif
}