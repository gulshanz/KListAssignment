package taksande.kewaldas.gulshan.klistassignment.klist

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

class KList private constructor(
    private val state: KListState
) {
    companion object {
        fun create(): KList = KList(KListState())
    }

    fun padding(padding: Dp): KList {
        return KList(state.copy(padding = padding))
    }

    fun <T> section(
        header: String,
        items: List<T>,
        onItemClick: ((T) -> Unit)? = null,
        itemContent: @Composable (T) -> Unit
    ): KList {
        val wrapper = KListSectionWrapper {
            SectionRenderer(header, items, onItemClick, itemContent)
        }
        return KList(state.copy(sections = state.sections + wrapper))
    }

    @Composable
    fun Render() {
        KListRenderer(state)
    }
}
