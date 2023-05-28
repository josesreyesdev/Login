package com.jsrdev.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jsrdev.loginflow.R
import com.jsrdev.loginflow.components.ButtonComponent
import com.jsrdev.loginflow.components.CheckboxComponent
import com.jsrdev.loginflow.components.ClickableLoginTextComponent
import com.jsrdev.loginflow.components.DividerTextComponent
import com.jsrdev.loginflow.components.HeadingTextComponent
import com.jsrdev.loginflow.components.MyTextFieldComponent
import com.jsrdev.loginflow.components.NormalTextComponent
import com.jsrdev.loginflow.components.PasswordTextFieldComponent
import com.jsrdev.loginflow.navigation.PostOfficeAppRouter
import com.jsrdev.loginflow.navigation.Screen

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column ( Modifier.fillMaxSize() ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                icon = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                icon = painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                icon = painterResource(id = R.drawable.mail_outline)
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                icon = painterResource(id = R.drawable.lock_icon)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.confirm_password),
                icon = painterResource(id = R.drawable.lock_icon)
            )

            CheckboxComponent(
                value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                }
            )

            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(value = stringResource(id = R.string.register))

            DividerTextComponent()

            ClickableLoginTextComponent(
                onTextSelected = {

                }
            )
        }

    }
}

@Preview(name = "SignUp")
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}