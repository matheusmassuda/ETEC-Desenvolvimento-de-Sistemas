
namespace MauiAppLogin
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            string? usuario_logado = null;

            Task.Run(async () =>
            {
                usuario_logado = await SecureStorage.Default.GetAsync("usuario_logado");

                if(usuario_logado == null)
                {
                    MainPage = new Login();
                } else
                {
                    MainPage = new Protegida();
                }
            });

            MainPage = new Login();
        }

        protected override Window CreateWindow(IActivationState? activationState)
        {
            var window = base.CreateWindow(activationState);

            window.Width = 400;
            window.Height = 600;

            return window;
        }

    } // Fecha Clasee
} // Fecha Namespace
