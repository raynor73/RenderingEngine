package ilapin.renderingengine

interface TextureLoadingRepository {

    fun loadTexture(textureName: String, path: String)
}