package taksande.kewaldas.gulshan.klistassignment.klist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KListRenderer(state: KListState) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(state.padding)
    ) {
        state.sections.forEach { wrapper ->
            item { wrapper.render() }
        }
    }
}
