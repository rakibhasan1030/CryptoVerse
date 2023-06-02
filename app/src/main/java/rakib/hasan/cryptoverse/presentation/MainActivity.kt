package rakib.hasan.cryptoverse.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import rakib.hasan.cryptoverse.presentation.coin_detail.CoinDetailScreen
import rakib.hasan.cryptoverse.presentation.coin_detail.Screen
import rakib.hasan.cryptoverse.presentation.coin_list.CoinListScreen
import rakib.hasan.cryptoverse.presentation.ui.theme.CryptoVerseTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoVerseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ){
                        composable(
                            route = Screen.CoinListScreen.route
                        ){
                            CoinListScreen(navController)
                        }
                        composable(
                            route = Screen.CoinListScreen.route + "/{coinId}"
                        ){
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}