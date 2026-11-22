import request from 'supertest';
import { createApp } from '../../src/app';

describe('GET /health', () => {
  it('répond 200 avec le statut UP', async () => {
    const res = await request(createApp()).get('/health');

    expect(res.status).toBe(200);
    expect(res.body).toEqual({ status: 'UP', service: 'delivery-service' });
  });

  it('répond 404 sur une route inconnue', async () => {
    const res = await request(createApp()).get('/route-inexistante');

    expect(res.status).toBe(404);
  });
});
