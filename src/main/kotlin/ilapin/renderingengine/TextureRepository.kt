package ilapin.renderingengine

interface TextureRepository {

    fun createTextureForRenderingDepth(textureName: String, width: Int, height: Int)

    fun createTextureForRendering(textureName: String, width: Int, height: Int)

    fun createTexture(textureName: String, width: Int, height: Int, data: IntArray)

    fun deleteTexture(textureName: String)
}