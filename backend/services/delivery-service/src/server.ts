import { createApp } from './app';
import { env } from './config/env';

const app = createApp();

app.listen(env.port, () => {
  console.log(`delivery-service démarré sur le port ${env.port}`);
});
